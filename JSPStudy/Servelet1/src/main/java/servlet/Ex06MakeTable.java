package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex06MakeTable")
public class Ex06MakeTable extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 데이터 꺼내오기
		
		int result1 = Integer.valueOf(request.getParameter("data1"));
		
		
		
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		
		out.print("<table border=1>");
		out.print("<tr>");
	
for(int i =1; i<=result1; i++) {
			
			out.print("<td>" + i + "</td>");
			
		}


out.print("</tr>");
out.print("</table>");




out.print("</body>");
out.print("</html>");
	
	
	// </table>태그는 단독으로 안쓰이고 </tr>과 <td>와 함깨한다
	// 여기서 굳이 </html>이나 </body> 까지 안넣어도 가능하다
	
	
	}

}
