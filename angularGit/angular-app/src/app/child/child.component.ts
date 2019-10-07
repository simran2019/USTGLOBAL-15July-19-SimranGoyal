import { Component, OnInit, Input, Output,EventEmitter} from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {
@Output() dataFromChild = new EventEmitter();
@Input() dataFromParent = '';

  constructor() { }

  ngOnInit() {
    this.dataFromChild.emit('this is data from child')
  }

}
