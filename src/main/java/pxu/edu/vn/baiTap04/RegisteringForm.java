package pxu.edu.vn.baiTap04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisteringForm
 */
@WebServlet("/RegisteringForm")
public class RegisteringForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisteringForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

		// Lấy giá trị của các trường từ request
		String lastName = request.getParameter("lastName");
		String firstName = request.getParameter("firstName");
		String birthdate = request.getParameter("birthdate");
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		String password = request.getParameter("password");


        // Xử lý dữ liệu và lưu vào cơ sở dữ liệu (nếu cần)
        
        // Gửi kết quả về màn hình
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Kết quả đăng ký tài khoản</title>");
        out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class=\"container\">");
        out.println("<h2 class=\"mt-4\">Kết quả đăng ký tài khoản:</h2>");
        out.println("<table class=\"table table-striped mt-4\">");
        out.println("<tr><td>Họ:</td><td>" + lastName + "</td></tr>");
        out.println("<tr><td>Tên:</td><td>" + firstName + "</td></tr>");
        out.println("<tr><td>Ngày sinh:</td><td>" + birthdate + "</td></tr>");
        out.println("<tr><td>Giới tính:</td><td>" + gender + "</td></tr>");
        out.println("<tr><td>Email:</td><td>" + email + "</td></tr>");
        out.println("<tr><td>Tên tài khoản:</td><td>" + username + "</td></tr>");
        out.println("<tr><td>Mật khẩu:</td><td>" + password + "</td></tr>");
        out.println("</table>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
	}

}
