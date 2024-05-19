# Script is meant to mimic the thought process

brain | script | keyboard
--- | --- | ---
a thought starts as few words | create note | `CTRL N`
soon other related thoughts join | create grouped notes | `CTRL G`
usually it grows into an idea | expand note into document | `CTRL E`
originates many other thoughts | create nested notes | `CTRL .`
sometimes grows further into a whole project | expand note to list, board or project | `CTRL E`
but other times it just gets rejected | delete note | `CTRL D`
or even forgotten on the back of the mind | archive note | `CTRL M`

From this we can derive need for the following data structures:
- **thought** : "node", of sorts, that represents a superclass for the other structures. Primarily holds relations, as in "a group of notes are identified by their relation to a central _thought_";
- **note**: _thought_ that contains some text, or _title_, usually just a few words;
- **document**: _note_ that contains a content body, that is a Markdown document with YAML frontmatter;
- **list**: _note_ or _document_ that contains other thoughts as children (other kind of relation);
- **board**: same as _list_, but with a different view. Meant to contain other lists. Can have a title and body as well.

This design is inspired by Trello, that is also made of boards, lists and notes (cards), but without this recursive nature (any Script note in a board can also be board by itself).

# ACs and complementary ideas

- [ ] Must be very reliable, NOT glitchy at all, including UI. This is the only way to ensure proper confidence to really use it as the "external brain" it is meant to be;
- [ ] Ful text search over notes and documents content, ignoring any formatting stuff, ordering results by recent activity, runs in background from most recent until end or stopped;
- [ ] All actions done with keyboard shortcuts, no buttons;
- [ ] WYSIWYG Markdown editor, leaving the markdown glyphs visible, only with different colors that help distinguish;
- [ ] Calendar feature, with notifications and alarms, entirely derived from the notes frontmatter content;
- [ ] Backup: shadow copy of all data in MD files on disk, and capability to fully restore from them;
- [ ] GIT as an automatic versioning system for these MD files
- [ ] "Easy to use" tagging UI, that saves on frontmatter;
- [ ] Multitenancy
- [ ] UI: boards can be used as "workspaces". Need a central "root" board to link the rest.
- [ ] Aspect: financial control sheet
- [ ] Aspect: maintenance sheet and alerts (vehicle and other things)

# Non-functional choices

- Web UI frontend with [Solid](https://www.solidjs.com/)
- Backend in Golang, when heavy processing is needed
- Cloud native (so we can use in mobile or other computers wherever):
  - frontend hosted in Firebase;
  - backend run as Google Cloud Functions;
  - data stored on Firebase 👈 not sure about this one yet;
- Desktop version for Ubuntu, mainly to avoid using backend cloud functions, but of frontend too;
- Automated deployment and versioning (semver + conventional commits + some crazy pipeline)

# Technical challenges

- What kind of database and structure to use? how to store data for:
  - document usage (notes, documents, lists, etc)
  - graph usage (links)
  - full text search
  - filesystem (AC of having the actual MD files available)
- How to implement an efficient full text search
- How to automate deployment and versioning - specifically, deploying a bunch of cloud functions automatically
