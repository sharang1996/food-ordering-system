# Food Ordering System
An application built using the principles of hexagonal architecture and domain driven design

## Dependency Graph
![dependency-graph](https://github.com/sharang1996/food-ordering-system/assets/15714187/6d3cffe8-4dc1-48ab-a10d-08975dfc0002)



### Generate Dependency Graph
mvn com.github.ferstl:depgraph-maven-plugin:aggregate -DcreateImage=true -DreduceEdges=false -Dscope=compile "-Dincludes=com.food.ordering.system*:*"
