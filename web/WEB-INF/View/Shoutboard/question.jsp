<%@ include file="../baseheader.jsp" %>

<div id="questionContainer">
    <c:forEach items="${questions}" var="ques">
        <div class="questionBlock">
            ${ques.title}
        </div>
    </c:forEach>
</div>

<%@ include file="../basefooter.jsp" %>
