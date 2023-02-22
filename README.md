# Comparison of solving differential equations in a continuous simulation
## Introduction

In a quasi-continuous simulation, numerical methods for solving differential equations are used. So the chosen methods are:

Algorithm  | Description
------------- | -------------
Euler method | one-step method
Runge-Kutta method  | multi-step method
### The solved differential equation

$$y(x) = c_1 \cdot e^{x} + x^{3} + 3x^{2} + 6x + 6,$$ where $c_{1}=1$

### The function 

$$\frac{dy}{dx} = y-x^{3}$$



## Result
![image](https://user-images.githubusercontent.com/45511879/220762145-102f81c4-2b24-44b3-a4cf-af37cd416b96.png)
</br>
Red curve - Real values </br>
Blue curve - Eulier values </br>
Black curve - RK4 value </br>

