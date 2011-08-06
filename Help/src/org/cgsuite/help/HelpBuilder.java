/* ****************************************************************************
 
 Combinatorial Game Suite - A program to analyze combinatorial games
 Copyright (C) 2003-06  Aaron Siegel (asiegel@users.sourceforge.net)
 http://cgsuite.sourceforge.net/
 
 Combinatorial Game Suite is free software; you can redistribute it
 and/or modify it under the terms of the GNU General Public License
 as published by the Free Software Foundation; either version 2 of the
 License, or (at your option) any later version.
 
 Combinatorial Game Suite is distributed in the hope that it will be
 useful, but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.
 
 You should have received a copy of the GNU General Public License
 along with Combinatorial Game Suite; if not, write to the Free Software
 Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110, USA
 
 **************************************************************************** */

package org.cgsuite.help;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class HelpBuilder
{
    public static void main(String[] args) throws Exception
    {
        File dir = new File("/Users/asiegel/NetBeansProjects/CGSuite/Help/src/org/cgsuite/help/docs/tutorials/using-cgsuite/");
        
        System.out.println("Converting: " + dir.getAbsolutePath());
        
        for (File file : dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.getName().endsWith(".cgsh");
            }
        }))
        {
            convert(file);
        }
    }
    
    private static void convert(File file) throws Exception
    {
        System.out.println("Converting: " + file.getName());
        
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        
        StringBuilder str = new StringBuilder();
        String line;
        while ((line = in.readLine()) != null)
        {
            str.append(line);
            str.append('\n');
        }
        in.close();
        
        File output = new File(file.getParent(), file.getName().replace(".cgsh", ".html"));
        PrintStream out = new PrintStream(new FileOutputStream(output));
        
        out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\">");
        out.println("<html><head>");
        out.println("<link rel=\"stylesheet\" href=\"nbdocs:/org/netbeans/modules/usersguide/ide.css\" type=\"text/css\">");
        out.println("<style type=\"text/css\">");
        out.println("code { font-size: 13pt; }");
        out.println("ul { list-style-type: disc; list-style-image: none; list-style-position: outside; }");
        out.println("</style>");
        out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
        out.println("<title>" + file.getName().substring(0, file.getName().lastIndexOf('.')) + "</title>");
        out.println("</head><body>");
        
        String markedUp = markup(str.toString());
        
        out.print(markedUp);
        out.println("</body></html>");
        out.close();
    }
    
    protected static int indexOf(String str, List<String> list){
        int size = list.size();
        for (int i=0; i < size; i++){
            if (list.get(i).equals(str))
                return i;
        }
        return -1;
    }
    
    protected static boolean inList(String str, List<String> list){
        for (String s : list){
            if (s.equals(str))
                return true;
        }
        return false;
    }
    
    private static String markup(String input)
    {
        String markup = input;
        markup = markup.replaceAll("\\\\\\>", "&gt;");
        markup = markup.replaceAll("\\\\\\<", "&lt;");
        markup = markup.replaceAll("\\\\\\^", "&renderascaret;");
        markup = markup.replaceAll("\\\\u", "&uarr;");
        markup = markup.replaceAll("\\\\d", "&darr;");
        markup = markup.replaceAll("\\\"", "&quot;");
        markup = markup.replaceAll("\\$(.*?)\\$", "<code>$1</code>");
        markup = markup.replaceAll("\\_(.*?)\\_", "<sub>$1</sub>");
        markup = markup.replaceAll("\\^(.*?)\\^", "<sup>$1</sup>");
        markup = markup.replaceAll("\\~(.*?)\\~", "<em>$1</em>");
        markup = markup.replaceAll("\\+\\+\\+(.*?)\\+\\+\\+", "<h2>$1</h2>");
        markup = markup.replaceAll("\\+\\+(.*?)\\+\\+", "<h3>$1</h3>");
        markup = markup.replaceAll("\n\n", "\n\n<p>");
        markup = markup.replaceAll("&renderascaret;", "^");
        return markup;
    }
    
    public static void generateHelpPages(File inputXml, File outputDir) throws javax.xml.parsers.ParserConfigurationException, org.xml.sax.SAXException, java.io.IOException
    {
        Document document = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputXml);
        NodeList methodElements = document.getElementsByTagName("method");
        for (int i = 0; i < methodElements.getLength(); i++)
        {
            Element methodElement = (Element) methodElements.item(i);
            String name = methodElement.getAttribute("name");
            String category = methodElement.getAttribute("category");
            NodeList parameters = methodElement.getElementsByTagName("argument");
            File categoryDir = new File(outputDir, category);
            categoryDir.mkdir();
            File outputfile = new File(categoryDir, name + ".html");
            java.io.PrintStream out = new java.io.PrintStream(new java.io.FileOutputStream(outputfile));
            out.print("<html>\n<head>\n<META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
            out.print("<title>" + name + "</title>\n</head>\n<body>\n");
            out.print("<h2>" + category + "</h2>\n");
            out.print("<h1><font face=\"monospaced\">" + name + "(");
            for (int j = 0; j < parameters.getLength(); j++)
            {
                out.print(markup(((Element) parameters.item(j)).getAttribute("name")));
                if (j+1 < parameters.getLength())
                {
                    out.print(",");
                }
            }
            out.print(")</font></h1>\n");
            out.print("<p>" + markup(methodElement.getElementsByTagName("description").item(0).getTextContent()));
            out.print("<p><b>Parameters</b></p>\n");
            for (int j = 0; j < parameters.getLength(); j++)
            {
                Element paramElement = (Element) parameters.item(j);
                out.print("<br><code>" + markup(paramElement.getAttribute("name")) + " - " + paramElement.getAttribute("type") + "</code>\n");
            }
            NodeList returns = methodElement.getElementsByTagName("returns");
            if (returns.getLength() > 0)
            {
                out.print("<p><b>Returns</b></p>\n");
                out.print("<p><code>" + ((Element) returns.item(0)).getAttribute("type") + "</code></p>\n");
            }
            NodeList examples = methodElement.getElementsByTagName("examples");
            if (examples.getLength() > 0)
            {
                out.print("<p><b>Examples</b></p>\n");
                out.print("<p>" + markup(examples.item(0).getTextContent()));
            }
            NodeList seeMethod = methodElement.getElementsByTagName("see-method");
            if (seeMethod.getLength() > 0)
            {
                out.print("<p><b>See Also</b></p><p>\n");
                for (int j = 0; j < seeMethod.getLength(); j++)
                {
                    Element seeMethodElement = (Element) seeMethod.item(j);
                    out.print("<code><a href=\"../" + seeMethodElement.getAttribute("category") + "/" + seeMethodElement.getAttribute("name") + ".html\">"
                              + seeMethodElement.getAttribute("name") + "</a></code>");
                    if (j+1 < seeMethod.getLength())
                    {
                        out.print(",");
                    }
                    out.println();
                }
                out.print("</p>\n");
            }
            
            out.print("</body>\n</html>\n");
            out.close();
        }
    }
}