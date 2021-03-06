import {ChangeDetectorRef, Directive, ElementRef, HostListener, NgZone} from '@angular/core';
import {FormControl, FormControlName} from '@angular/forms';
import {element} from 'protractor';

@Directive({
  selector: '[to-upper]'
  /*selector: 'input[to-upper]'*/
})
export class ToUpperDirective {

  constructor(public element: ElementRef, public ref: ChangeDetectorRef) {
  }

  @HostListener('keyup')
  public onInputChange() {
    console.log("aqui");
    let valor = this.element.nativeElement.value;
    this.element.nativeElement.value = valor.toUpperCase();
    this.ref.detectChanges();
  }

}
