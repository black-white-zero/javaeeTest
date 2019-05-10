<body>
    <%
        String info = (String)request.getAttribute("info");
            if(info != null) {
                out.print("<center>");
                out.print("<font size=10>");
                out.print("<B>");
                out.print(info);
                out.print("</B>");
                out.print("</font>");
                out.print("</center>");
        }
    %>
</body>