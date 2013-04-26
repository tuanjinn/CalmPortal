<%@ include file="../baseheader.jsp" %>
<h1>Choose your coaching programme</h1>
<div id="questionContainer">
    <div class="programmeDetailsBlock" id="prog-${prog.programmeId}" blockId="${prog.programmeId}">
        <div class="title">${prog.title}</div>
        <div class="shortDescription">${prog.shortDescription}</div>

        <div class="description" id="desc-${prog.programmeId}">
            ${prog.description}
        </div>
    </div>        
</div>

<%@ include file="../basefooter.jsp" %>
