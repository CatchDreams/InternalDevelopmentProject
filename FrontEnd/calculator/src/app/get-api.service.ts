import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class GetAPIService {

  constructor(private http:HttpClient) { }

  apiCall(){
    return this.http.get("http://localhost:8081/calculator/add/25/90");
  }
}
