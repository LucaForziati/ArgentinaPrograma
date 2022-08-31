import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Acerca } from '../model/acerca';

@Injectable({
  providedIn: 'root'
})
export class AcercaService {

  URL = 'https://backendarp.herokuapp.com/acerca/';

  constructor(private httpClient: HttpClient) { }

  public lista(): Observable<Acerca[]>{
    return this.httpClient.get<Acerca[]>(this.URL + 'lista');
  }

  public detail(id: number): Observable<Acerca>{
    return this.httpClient.get<Acerca>(this.URL + `detail/${id}`);
  }

  public save(acerca: Acerca): Observable<any>{
    return this.httpClient.post<any>(this.URL + 'create', acerca);
  }

  public update(id: number, acerca: Acerca): Observable<any>{
    return this.httpClient.put<any>(this.URL + `update/${id}`, acerca);
  }

  public delete(id: number): Observable<any>{
    return this.httpClient.delete<any>(this.URL + `delete/${id}`);
  }

}
