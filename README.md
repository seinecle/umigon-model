# Shared data structures between umigon projects

Umigon is the name given to a coding project for sentiment analysis. With the project expanding, naming has changed and the initial codebase has been split to decouple different parts of the project.

umigon-model is the repo that contains the objects and other data structures that are used and shared between these different repos.

## Installation

```xml
<dependency>
	<groupId>net.clementlevallois.functions</groupId>
	<artifcactId>umigon-model</artifactId>
	<version>0.15</version>
</dependency>
```
Or [check on Maven](https://central.sonatype.com/artifact/net.clementlevallois.functions/umigon-model) to see the latest version.


# Releases

- Oct 21, 2023. Added an int property to TextFragment objects, to index in which sentencelikefragment the textfragment is sitting.

- Aug 28, 2023. Split the dependency to relocate the model for classification in a separate module: umigon-model-classification, also on Maven. The reason is that classes for classification were changing frequently, obliging to update the entire artifact version even if the rest of the model was remaining stable. 

# License
See the [license](LICENSE.md) file. These data and code can be used for non commercial *and commercial* purposes.

# Credit
For academic use, cite this reference:

Levallois, Clement. “Umigon: Sentiment analysis on Tweets based on terms lists and heuristics”. Proceedings of the 7th International Workshop on Semantic Evaluation (SemEval), 2013, Atlanta, Georgia


# Contact
Clement Levallois, @seinecle on Twitter or https://clementlevallois.net
