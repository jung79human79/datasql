package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet : url 맵핑 기술 --> html에 맵핑한 코드를 html의 action 속성에 적으면 에러 발생 즉 정상적인 파일명을 자바코드와 html코드에 적어야 한다
// 사용자가 적은 데이터가 url에 안보이게 하려면 http 프로토콜 메소드를 get방식이 아닌 post방식으로 해야함
@WebServlet("/Ex06MakeTable")
public class Ex06MakeTable extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 데이터 꺼내오기
		
		int result1 = Integer.valueOf(request.getParameter("data1"));
		// html코드(동기페이지) 출력하기	
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
