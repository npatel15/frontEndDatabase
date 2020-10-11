<script type="text/javascript" src='js/jquery.min.js'></script>
<script type='text/javascript'>
$(document).ready(function()
{
$('#UpdateButton').click(function()
{
var MSG = $("#Message").val();
var dataString = 'message='+ MSG;
$.ajax({
type: "POST",
url: "InsertMessage",
data: dataString,
cache: false,
success: function(data)
{
$("#Message").val('');
$("#content").prepend(data);
$("#Message").focus();
}
});
return false;
});
});
</script>

<textarea id='Message'></textarea><br/>
<input type='button' value=' Update ' id='UpdateButton'/>
<div id='content'></div>