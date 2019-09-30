// function validateemail(){
// let f1 = document.forms[0];
// let n = f1.email.value;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
// if(n==='')
// {
//     alert("enter details")
//     return false;
// }
// else if(n.length>4){
//     f1.email.style.border = '2px solid green';
//     let t1 = document.getElementById('par1');
//     t1.textContent ="";
//     return true;
// }else{
//     f1.email.style.border = '2px solid red';
//     let t1 = document.getElementById('par1');
//     t1.textContent ="minimun length is 6";
//     return false;
// }
// }


// function validatepass(){
//     let f2 = document.forms[0];
//     let t2 = f2.password.value;
//     if(t2.length>5){
//         f2.password.style.border = '2px solid green';
//         let t3 = document.getElementById('par2');
//         t3.textContent="";
//         return true;
//     }else{
//         f2.password.style.border = '2px solid red';
//         let t3 = document.getElementById('par2');
//         t3.textContent="minimum length is 5";
//         return false;
//     }

// }




//===========form with the hellp of js===============

let f = document.createElement('form');
let l1 = document.createElement('label')
l1.textContent='Name';

f.appendChild(l1);

let i1 = document.createElement('input');
i1.setAttribute('type' , 'text');
f.appendChild(i1);
let b1 = document.createElement('br');
f.appendChild(b1);
let l2 = document.createElement('label')
l2.textContent='Email';
f.appendChild(l2);
let i2 = document.createElement('input');
i2.setAttribute('type' , 'email');
f.appendChild(i2);
let b2 = document.createElement('br');
f.appendChild(b2);
let l3 = document.createElement('label')
l3.textContent='Password';
f.appendChild(l3);
let i3 = document.createElement('input');
i3.setAttribute('type' , 'password');
f.appendChild(i3);
let b3 = document.createElement('br');
f.appendChild(b3);
let i4 = document.createElement('button');
i4.textContent='button';
i4.setAttribute('type' , 'button');
f.appendChild(i4);

document.body.appendChild(f);


//==========validation for form=========

