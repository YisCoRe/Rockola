<%@page import="com.google.gson.Gson"%>
<%@page import="TO.TOusuario"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controller.CtrlUsuarios"%>

<%
CtrlUsuarios usuariosCtrl = new CtrlUsuarios();
String Opcion = request.getParameter("Opcion");
if ("listar".equals(Opcion)) {
	ArrayList<TOusuario> usuarios = usuariosCtrl.consultarUsuarios();
	out.print(new Gson().toJson(usuarios));

} else {
	out.print("Opcion no valida");

}
%>