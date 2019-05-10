package service;

import beans.UserBean;
import dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.regex.*;

public class SignInServlet extends HttpServlet{

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String repassword = request.getParameter("repassword");

        String pattern = "[a-zA-Z0-9]{6,8}";
        boolean isMatch = Pattern.matches(pattern, password);
        if(isMatch) {
            UserDao userDao = new UserDao();
            if(username != null && !username.isEmpty()) {
                //用户名不存在可以注册
                if(userDao.isUserExist(username) && userDao.isPasswordConfirm(password, repassword)) {
                    UserBean userBean = new UserBean();
                    userBean.setPassword(password);
                    userBean.setUsername(username);
                    userDao.saveUser(userBean);
                    request.getRequestDispatcher("register_success.jsp").forward(request, response);
                }else {
                    if(!userDao.isUserExist(username))
                        request.getRequestDispatcher("register_failure.jsp").forward(request, response);
                    if(!userDao.isPasswordConfirm(password, repassword))
                        request.getRequestDispatcher("register_failure.jsp").forward(request, response);
                }
            }
        }else {
            request.setAttribute("info", "Sorry! Password not inValid!");
        }
        //forward to message.jsp
        request.getRequestDispatcher("message.jsp").forward(request, response);
    }
}