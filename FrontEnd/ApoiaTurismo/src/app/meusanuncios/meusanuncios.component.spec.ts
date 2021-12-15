import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MeusanunciosComponent } from './meusanuncios.component';

describe('MeusanunciosComponent', () => {
  let component: MeusanunciosComponent;
  let fixture: ComponentFixture<MeusanunciosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MeusanunciosComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MeusanunciosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
