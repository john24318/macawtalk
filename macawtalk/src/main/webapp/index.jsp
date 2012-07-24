<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Macaw index</title>
</head>
<body>
    <table>
        <s:iterator value="settingsList" status="i">
            <tr>
                <td><s:property value="setname"/></td>
                <td><s:property value="setdesc"/></td>
            </tr>
        </s:iterator>
    </table>
</body>
</html>