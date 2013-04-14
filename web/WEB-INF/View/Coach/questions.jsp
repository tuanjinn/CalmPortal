<%@ include file="../baseheader.jsp" %>

<div id="questionContainer">
    <c:forEach items="${questions}" var="ques">
        <div class="questionBlock bghover" id="ques-${ques.questionId}" blockId="${ques.questionId}">
            <div class="title">${ques.title}</div>
            <div class="shortDescription">${ques.shortDescription}</div>
            
            <div class="description" id="desc-${ques.questionId}">
                ${ques.description}
            </div>
        </div>
        
    </c:forEach>
</div>

<%@ include file="../basefooter.jsp" %>
