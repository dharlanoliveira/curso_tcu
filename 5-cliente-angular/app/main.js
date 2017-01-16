"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var core_1 = require("@angular/core");
var platform_browser_1 = require("@angular/platform-browser");
var platform_browser_dynamic_1 = require("@angular/platform-browser-dynamic");
var tasklist_component_1 = require("./tasklist.component");
var router_1 = require("@angular/router");
var app_component_1 = require("./app.component");
var newtask_component_1 = require("./newtask.component");
var forms_1 = require("@angular/forms");
var toupper_directive_1 = require("./diretivas/toupper.directive");
var filter_pipe_1 = require("./pipes/filter.pipe");
var order_pipe_1 = require("./pipes/order.pipe");
var appRoutes = [
    { path: 'tasks',
        component: tasklist_component_1.TasklistComponent
    },
    { path: 'newtask',
        component: newtask_component_1.NewTaskComponent
    },
    { path: '',
        redirectTo: '/tasks',
        pathMatch: 'full'
    } /*,
    { path: 'pipes',
        component: PipesComponent
    },*/
];
var AppModule = (function () {
    function AppModule() {
    }
    AppModule = __decorate([
        core_1.NgModule({
            imports: [platform_browser_1.BrowserModule, router_1.RouterModule.forRoot(appRoutes), forms_1.FormsModule, forms_1.ReactiveFormsModule],
            declarations: [app_component_1.AppComponent, tasklist_component_1.TasklistComponent, newtask_component_1.NewTaskComponent, toupper_directive_1.ToUpper, order_pipe_1.OrderPipe, filter_pipe_1.FilterPipe,],
            bootstrap: [app_component_1.AppComponent]
        }), 
        __metadata('design:paramtypes', [])
    ], AppModule);
    return AppModule;
}());
exports.AppModule = AppModule;
platform_browser_dynamic_1.platformBrowserDynamic().bootstrapModule(AppModule)
    .catch(function (err) { return console.error(err); });
;
//# sourceMappingURL=main.js.map