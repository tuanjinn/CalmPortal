<%@ include file="../baseheader.jsp" %>

<div id="questionContainer">
    <c:forEach items="${questions}" var="ques">
        <div class="questionBlock bghover" id="ques-${ques.questionId}}">
            <div class="title">${ques.title}</div>
            <div class="description">${ques.description}</div>
        </div>
    </c:forEach>
</div>

<%@ include file="../basefooter.jsp" %>
