import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LogindetailComponent } from './logindetail.component';

describe('LogindetailComponent', () => {
  let component: LogindetailComponent;
  let fixture: ComponentFixture<LogindetailComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LogindetailComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LogindetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
