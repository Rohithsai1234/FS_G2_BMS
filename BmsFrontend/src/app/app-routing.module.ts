import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UsersComponent } from './admin/users/users.component';
import { BooksComponent } from './admin/books/books.component';
import { ShopbookComponent } from './shopbook/shopbook.component';
import { LoginComponent } from './login/login.component';
import { LogoutComponent } from './logout/logout.component';
import { AuthGaurdService } from './service/authguard.service';
import { ListComponent } from './admin/list/list.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';





const routes: Routes = [
  { path: 'admin/users', component: UsersComponent,canActivate:[AuthGaurdService] },
  { path: 'admin/books', component: BooksComponent,canActivate:[AuthGaurdService] },
  { path: 'shop', component: ShopbookComponent,canActivate:[AuthGaurdService] },
  { path: 'login', component: LoginComponent },
  { path: 'logout', component: LogoutComponent,canActivate:[AuthGaurdService] },
  { path: 'admin/list', component: ListComponent,canActivate:[AuthGaurdService] },
  
  { path: '**', pathMatch: 'full', component: PagenotfoundComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
