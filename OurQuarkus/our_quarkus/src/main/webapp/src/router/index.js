import { createRouter, createWebHistory } from 'vue-router'
import Home from '../views/Home.vue'


const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/alldata',
    name: 'ShowAllDataWindow',
    component: () => import('../views/ShowAllDataWindow.vue')
  },
  {
    path: '/adddata',
    name: 'AddDataWindow',
    component: () => import('../views/AddDataWindow.vue')
  },
  {
    path: '/selecteddata',
    name: 'SelectedDataWindow',
    component: () => import('../views/SelectedDataWindow.vue')
  },
  {
    path: '/modifyingdata',
    name: 'ModifyingDataWindow',
    component: () => import('../views/ModifyingDataWindow.vue')
  },
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
