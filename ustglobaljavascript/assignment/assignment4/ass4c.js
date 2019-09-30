let form=document.createElement('form');
let label=document.createElement('label');
label.textContent='Name';
form.appendChild(label);
let br=document.createElement('br')
form.appendChild(br);
let input=document.createElement('input');
input.setAttribute('type','text');
form.appendChild(input);

let br1=document.createElement('br')
form.appendChild(br1);

let label1=document.createElement('label');
label1.textContent='Password';
form.appendChild(label1);
let br2=document.createElement('br')
form.appendChild(br2);
let input1=document.createElement('input');
input1.setAttribute('type','password');
form.appendChild(input1);

let br3=document.createElement('br')
form.appendChild(br3);

let labe2=document.createElement('label');
labe2.textContent='E-mail';
form.appendChild(labe2);
let br4=document.createElement('br')
form.appendChild(br4);
let input2=document.createElement('input');
input2.setAttribute('type','email');
form.appendChild(input2);

let br5=document.createElement('br')
form.appendChild(br5);

let labe3=document.createElement('label');
labe3.textContent='Address';
form.appendChild(labe3);
let br6=document.createElement('br')
form.appendChild(br6);
let input3=document.createElement('input');
input3.setAttribute('type','text');
form.appendChild(input3);

let br7=document.createElement('br')
form.appendChild(br7);

let labe4=document.createElement('label');
labe4.textContent='Date Of Birth';
form.appendChild(labe4);
let br8=document.createElement('br')
form.appendChild(br8);
let input4=document.createElement('input');
input4.setAttribute('type','date');
form.appendChild(input4);

let br9=document.createElement('br')
form.appendChild(br9);
let button=document.createElement('button');
button.setAttribute('type','submit');
form.appendChild(button);
    

form.style.border='2px solid black';
form.style.width='25%';
form.style.marginLeft='25%';
label.style.padding='10px';
label1.style.padding='10px';
labe2.style.padding='10px';
labe3.style.padding='10px';
labe4.style.padding='10px';

input.style.marginLeft='10px';
input1.style.marginLeft='10px';
input2.style.marginLeft='10px';
input3.style.marginLeft='10px';
input4.style.marginLeft='10px';



console.log(form);

document.body.appendChild(form);