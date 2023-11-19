# Food Ordering System
An application built using the principles of hexagonal architecture and domain driven design

## Architecture
![architecture](https://github.com/sharang1996/food-ordering-system/assets/15714187/e6590779-8c29-4376-93bc-6a49210cda02)


## Dependency Graph
![dependency-graph](https://github.com/sharang1996/food-ordering-system/assets/15714187/69be8f79-1b2a-49f2-ad13-9b4223d108fc)

### Generate Dependency Graph
mvn com.github.ferstl:depgraph-maven-plugin:aggregate -DcreateImage=true -DreduceEdges=false -Dscope=compile "-Dincludes=com.food.ordering.system*:*"

## Order Lifecycle
![order-state-transitions](https://github.com/sharang1996/food-ordering-system/assets/15714187/fd5d1a8b-4e45-4c29-915a-5391fd05b419)

## Order Service
![order-service-domain](https://github.com/sharang1996/food-ordering-system/assets/15714187/8da2fa38-d291-4a95-a272-6e8c346079d3)
