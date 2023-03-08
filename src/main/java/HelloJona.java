import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/jona")
public class HelloJona extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)  throws IOException{
        PrintWriter out = response.getWriter();
        out.println("<h1>HELLO JONA</h1><br><h2>Growth Mindset!<h2>");
    }
}
