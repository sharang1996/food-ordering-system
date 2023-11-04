# Food Ordering System
An application built using the principles of hexagonal architecture and domain driven design

## Dependency Graph
![dependency-graph](https://github.com/sharang1996/food-ordering-system/assets/15714187/69be8f79-1b2a-49f2-ad13-9b4223d108fc)




### Generate Dependency Graph
mvn com.github.ferstl:depgraph-maven-plugin:aggregate -DcreateImage=true -DreduceEdges=false -Dscope=compile "-Dincludes=com.food.ordering.system*:*"
