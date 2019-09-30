function validateForm(){
 let formData =  document.forms[0];
//  console.log(formData);
// console.log(formData.Uname.value);
let userName = formData.uname.value;
let passwordvalue= formData.pass.value;

if(userName.length>4 && passwordvalue.length>7){
    console.log('success');
    formData.uname.style.border= '4px solid green';
    formData.pass.style.border='4px solid green';
    formData.login.disabled = false;
}
else{
    formData.uname.style.border = '4px solid red';
    name1.textContent="enter the valid data";
    formData.pass.style.border = '4px solid purple';
    formData.login.disabled = true;
}
}
  
//     formData.uname.style.border='green';
// }
// else{
//     formData.uname.style.border = '4px solid red';
// }
// }
// function validatepass(){
//     let formData= document.forms[0];
//     let passwordvalue = formData.pass.value;
//     if(passwordvalue.lenght>7){
//         console.log('success');
//         formData.pass.style.border ='green';
//     } 
//     else{
//         formData.pass.style.border = '4px solid purple';
//     }
// }