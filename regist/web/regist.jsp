<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>用户注册</title>
  </head>
  <body>
    <form action="${pageContext.request.contextPath}/regist.action" method="post">
      用户名：<input type="text" name="username" /><br/>
      密码：<input type="text" name="password" /><br/>
      性别：<input type="radio" name="gender" value="0"/>女
          <input type="radio" name="gender" value="1"/>男<br/>
      生日：<input type="text" name="birthday"/><br/>
      邮箱：<input type="text" name="email"/><br/>
      <input type="submit" value="注册"/>
    </form>
  </body>
</html>
