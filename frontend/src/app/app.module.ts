import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { LandingComponent } from './landing/landing.component';
import { HomeComponent } from './home/home.component';
import { ProfileComponent } from './profile/profile.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { LocationsComponent } from './locations/locations.component';
import { LocationComponent } from './location/location.component';
import { LocationDetailsComponent } from './location-details/location-details.component';
import { PlayerBannerComponent } from './player-banner/player-banner.component';
import { TeamBannerComponent } from './team-banner/team-banner.component';

@NgModule({
  declarations: [
    AppComponent,
    NavBarComponent,
    LandingComponent,
    HomeComponent,
    ProfileComponent,
    LocationsComponent,
    LocationComponent,
    LocationDetailsComponent,
    PlayerBannerComponent,
    TeamBannerComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FontAwesomeModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
