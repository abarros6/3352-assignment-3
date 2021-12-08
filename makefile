JFLAGS = -g
JC = javac

.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
        Filter.java \
        Pipe.java \
        minElimFilter.java \
        maxElimFilter.java \
		celToFarFilter.java \
		displayFilter.java \
		tempTransformerApp.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class
	
run:
	java tempTransformerApp