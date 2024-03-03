package com.example.javapractice.basic;

public class TextBlock {
    public static void main(String[] args) {
        //java 15 之前使用字串串接
        String title = "Java Tutorial";
        String content=" <b>Hello, World</b>";
        String html = "<!DOCTYPE html>\n"
                + "<html lang=\"zh-tw\">\n"
                + "<head>\n"
                + "     <title>" + title + "</title>\n"
                + "<body>\n"
                +     content
                + "</body>\n"
                + "</html>\n";

        // java 15 後可以使用 text block
        html =
        """ 
                <!DOCTYPE html>
                <html lang="zh-tw">
                <head>
                        <title>%s</title>
                </head>
                <body>
                            %s
                </html>
        """;
        title = "Java Tutorial";
        content = "<b>Hello, World</b>";
        System.out.println(html.formatted(title, content));
    }
}
