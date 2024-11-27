
const $ =selector => document.querySelector(selector);

const processEntries=evt =>{

const email1=$("#email1").value;
const email2=$("#email2").value;
let is_valid=true;

if(email1 == "")
{
    // alert("email is required");
    $("#error1").textContent ="Email is required";
    is_valid=false;
}
else
{
    $("#error1").textContent="";
}

if(email2 == "")
    {
        // alert("confirm email is required");
    $("#error2").textContent ="Confirm Email is required";
        is_valid=false;    
    } 
    else
    {
        $("#error2").textContent="";

    }

if(!is_valid)
{
    evt.preventDefault();
}
}



document.addEventListener("DOMContentLoaded",() => {
    $("#submit").addEventListener("click", processEntries)});
