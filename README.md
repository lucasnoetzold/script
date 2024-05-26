# Script 

...is meant to mimic the thought process.  

My very own custom mix of external brain, task management, calendar, project management and note taking app.

# Vision

To have a good external brain app. One that can represent the complex structure of thoughts and their relations,
that is quick and reliable to use in a hurry and that does not create too much of passive to be later organized.

A place I can store all information that comes up through the day, from a grossery list to life goals and projects.
So, by letting the computer remind me of all the things he can, I can free up some neurons for creativity (or so I hope).

# Core ideas, key features & premises

1. Unrestricted graph
    1. No limit for the number of connectins of a node (_thought_) can have;
    2. No implicit (nor explicit) direction for the graph.  
        i.e. no concept of "parent" and "child" node,
        allowing complex and even cyclic structures;
2. Data ownership & accessibility from outside the app.
    Text-based ([markdown] + [frontmatter]) storage on local filesystem.  
    You data is yours, no strict dependency on the app to use it, as it's
    meant to be simply a GUI tool for the _ease of use_;
4. Plugin-like extensibility.  
    All behavior that **could be** implemented as an extension, **should be**.

[markdown]: https://daringfireball.net/projects/markdown/
[frontmatter]: https://jekyllrb.com/docs/front-matter/

And talking about plugins...

## Core extensions

2. [ ] GIT as a versioning tool.  
    I'm a developer, and it's all text anyway...  
    Really thou, GIT is great for versioning, not just code, but any text;
5. [ ] Task & ToDo aspect.  
    Some _thoughts_ can be done, or archived, or something like that;
4. [ ] Clock & Calendar aspect.  
    Some _thoughts_ are just reminders. The tool should remind em for us.

---

the sequence below is the foundation for the idea
brain | script | keyboard
-- | - | -
a thought starts as few words | create note | `CTRL N`
soon other related thoughts join | create grouped notes | `CTRL G`
usually it grows into an idea | expand note into document | `CTRL E`
originates many other thoughts | create nested notes | `CTRL .`
sometimes grows further into a whole project | expand note to list, board or project | `CTRL E`
but other times it just gets rejected | delete note | `CTRL D`
or even forgotten on the back of the mind | archive note | `CTRL M`
