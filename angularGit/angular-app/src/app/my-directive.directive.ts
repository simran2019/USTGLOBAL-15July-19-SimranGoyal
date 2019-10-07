import { Directive, ElementRef, HostListener, HostBinding } from '@angular/core';

@Directive({
  selector: '[appMyDirective]'
})
export class MyDirectiveDirective {
  // elementRef: any;

  constructor(private elementRef: ElementRef) { 
    elementRef.nativeElement.style.background = 'pink';
    elementRef.nativeElement.style.color = 'white';
    elementRef.nativeElement.style.padding= '100px';
    elementRef.nativeElement.style.marginTop = '70px'
  }

@HostBinding('style.background') background: string;


  @HostListener('mouseenter')
  mouseEnter(){
this.background = "skyblue";



console.log('mouse entered')
alert('mouse entered');

// next program


 this.elementRef.nativeElement.style.background = 'red';
    this.elementRef.nativeElement.style.color = 'black';


  }


  @HostListener('mouseleave')
  mouseLeave(){
    this.background ='purple';
    this.elementRef.nativeElement.style.background = 'red';
    this.elementRef.nativeElement.style.color = 'red';
  }

}



