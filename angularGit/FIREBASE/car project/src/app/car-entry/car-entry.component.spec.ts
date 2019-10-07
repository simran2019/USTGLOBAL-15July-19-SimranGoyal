import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CarEntryComponent } from './car-entry.component';

describe('CarEntryComponent', () => {
  let component: CarEntryComponent;
  let fixture: ComponentFixture<CarEntryComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CarEntryComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CarEntryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
