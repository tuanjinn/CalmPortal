<%@ include file="../baseheader.jsp" %>

<div id="questionContainer">
    <c:forEach items="${questions}" var="ques">
        ${ques.title}
    </c:forEach>
</div>

<%@ include file="../basefooter.jsp" %>
