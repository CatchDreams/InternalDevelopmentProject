import { Component } from '@angular/core';
import {GetAPIService} from './get-api.service'

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'calculator';
  constructor(private get:GetAPIService){
    this.get.apiCall().subscribe(data=>{
      console.warn(data);
    })
  }
}
