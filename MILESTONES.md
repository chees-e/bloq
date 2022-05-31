# Milestone 1

Our project will be a 2D level designer built in Java that will produce a PNG image. The intended audience is people with a beginning interest in game design, who would like to preview their map design before full implementation. 

Users can create a blank canvas to a size (width and height) of their liking or use the default size. There will be block types (land, water) and obstacle types (enemies, lava). The obstacles will differ from blocks as users can define rules for them using conditionals. Users can also use loops to place blocks next to each other. 

Our TA mentioned that we should consider how our features will interact with each other, so we plan to allow variables in loops. 

The plan for next week is to create the set of grammar rules by the weekend, then have the prototype user study completed by the middle of next week. The prototype user study will consist of participants using our grammar rules to generate the map design. Since we do not have the implementation yet, we will hand draw the map for them. We want to have two group members conduct the user studies while the other three continue to fine tune the grammar and potentially get started on the implementation by Friday.

A rough plan for the week after milestone 2 would be to complete the implementation by mid week. Then two team members will conduct the task driven user study, while the other three start the video. After gathering the data from the study, we will all complete the video together. 

# Milestone 2
Since Milestone 1, we have finished the parser and got started on a UI. We have conducted one prototype user study with another one planned for the weekend of May 27th, and received some useful feedback that we will be incorporating into our DSL.

We decided to use Java and ANTLR to implement the frontend of our DSL for the parsing and lexing components, Java will also be used for validating (static/dynamic checks). Then, from there we will generate Python/JavaScript code and do the backend components and image processing with the Python library Pillow or the JavaScript library ImageMagick. We will also implement a UI using JavaFX so the user can type into a text editor and execute their code, then they can see the map generated beside their code.

We’ve divided the tasks into issues on GitHub and assigned them to whoever will be responsible for them. We hope to finish the implementation by Monday to Tueday next week and start on the user studies and video afterwards.
