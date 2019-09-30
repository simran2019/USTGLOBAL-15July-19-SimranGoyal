function sayHello(){
    alert('hello!!!!');
}
let buttonElement = document.getElementById('button')
buttonElement.onclick=function(){
    alert("hello world")
}
    function smile(){
        let pElementData = document.createElement('p');
        pElementData.textContent='this is p element';
        document.body.appendChild(pElementData);
    } 
    function smile1(){
        let pElementData1 = document.createElement('p');
        pElementData1.textContent='this is our love';
        document.body.appendChild(pElementData1);
    }
// let pElementData2 = document.getElementById('alert hi') 
// pElementData2.addEventListener('mouseover',function(){
//     alert("i love you")
// })
let h1Element = document.createElement('h1');
function showText(){
    let inputElement = document.getElementById('showData');
    console.log(inputElement.value);
 h1Element.textContent = inputElement.value;
    document.body.appendChild(h1Element);
}