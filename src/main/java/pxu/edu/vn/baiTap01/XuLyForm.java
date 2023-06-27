package pxu.edu.vn.baiTap01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class XuLyForm
 */
@WebServlet("/XuLyForm")
public class XuLyForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public XuLyForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Form Processing Result</title>");
            out.println("</head>");
            out.println("<body>");

            String textFieldValue = request.getParameter("textfield");
            String hiddenTextFieldValue = request.getParameter("hiddentextfield");
            String checkBoxValue = request.getParameter("checkbox");
            String listBoxValue = request.getParameter("listbox");
            String radioButtonValue = request.getParameter("radiobutton");

            out.println("<h1>Form Processing Result:</h1>");
            out.println("<p>Text Field Value: " + textFieldValue + "</p>");
            out.println("<p>Hidden Text Field Value: " + hiddenTextFieldValue + "</p>");
            out.println("<p>Check Box Value: " + checkBoxValue + "</p>");
            out.println("<p>List Box Value: " + listBoxValue + "</p>");
            out.println("<p>Radio Button Value: " + radioButtonValue + "</p>");

            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

}
