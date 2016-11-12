/* tslint:disable:no-unused-variable */
import { AppComponent }    from './app.component';
import { BannerComponent } from './banner.component';
import { DebugElement }    from '@angular/core';

import { ComponentFixture, TestBed } from '@angular/core/testing';

import { By }              from '@angular/platform-browser';

let comp:    AppComponent;
let fixture: ComponentFixture<AppComponent>;
let de:      DebugElement;
let el:      HTMLElement;

/// Delete this
describe('Smoke test', () => {
  it('should run a passing test', () => {
    expect(true).toEqual(true, 'should pass');
  });
});

describe('AppComponent with TCB', function () {
  beforeEach(() => {
    TestBed.configureTestingModule({declarations: [AppComponent]});
    fixture = TestBed.createComponent(AppComponent);
    comp = fixture.componentInstance;
  });

  it('should instantiate component', () => {
    expect(fixture.componentInstance instanceof AppComponent).toBe(true, 'should create AppComponent');
  });

  it('should have expected <h1> text', () => {
    fixture.detectChanges();

    let h1 = fixture.debugElement.query(el => el.name === 'h1').nativeElement;  // it works
    h1 = fixture.debugElement.query(By.css('h1')).nativeElement;            // preferred

    expect(h1.innerText).toMatch(/angular app/i, '<h1> should say something about "Angular App"');
  });
  
  it('should test test function', () => {
      expect(comp.test()).toBe(2, 'should return2');
  });    
});

describe('Banner Component', function () {
  beforeEach(() => {
    TestBed.configureTestingModule({declarations: [BannerComponent]});
  });

  it('should instantiate component', () => {
    let fixture = TestBed.createComponent(BannerComponent);
    expect(fixture.componentInstance instanceof BannerComponent).toBe(true, 'should create BannerComponent');
  });
});
