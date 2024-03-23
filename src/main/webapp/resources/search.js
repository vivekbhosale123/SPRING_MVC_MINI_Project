
function search(str)
{
   alert("gggg")
   let xhttp=new XMLHttpRequest();
   xhttp.onreadystatechange=function()
   {
	   if(this.readyState==4 && this.status==200)
	   {
		   document.getElementById("v").innerHTML=this.responseText;
	   }
   }
   xhttp.open("GET","searchEmployee",true);
   xhttp.send();
}