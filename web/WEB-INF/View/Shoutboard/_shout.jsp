<div class="shoutBlock bghover softRounded" id="sh-${shout.shoutId}">
    <div class="shoutAva">
        <img class="ava" src="../../images/ava/${shout.user.ava}" />
    </div>
    <div class="shoutHeader">
        <span class="userDisplayName">${shout.user}</span> in <span class="location">${shout.location}</span> <span class="time">(${shout.getSimpleDateTime()})</span> 
    </div>
    <div class="shoutMsgBlock">
        ${shout.msg}
    </div>            
</div>