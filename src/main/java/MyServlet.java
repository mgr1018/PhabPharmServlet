import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.stream.Collectors;

@WebServlet(urlPatterns={"/phabpharm"},loadOnStartup=1)
public class MyServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException {
        resp.setContentType("text/html");
        DataBase db = new DataBase();
        resp.getWriter().write("<html><head><title>CMDMC</title></head><body><h1>Name from database: " + db.name1 + "</h1></body></html>");
        resp.getWriter().write(req.getServletPath());
        }
        @Override
        public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        }
    }

