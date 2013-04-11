<%@ include file="../baseheader.jsp" %>

<div id="questionContainer">
    <c:forEach items="${questions}" var="ques">
        <div class="questionBlock bghover" id="ques-${ques.questionId}" quesId="${ques.questionId}">
            <div class="title">${ques.title}</div>
            <div class="shortDescription">${ques.shortDescription}</div>
            
            <div class="quesDescription" id="quesDesc-${ques.questionId}">
                ${ques.description}
            </div>
        </div>
        
    </c:forEach>
</div>

<%@ include file="../basefooter.jsp" %>
