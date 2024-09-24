 public class song {
        class Song {
            private String title;
            private Song next;

            public Song(String title) {
                this.title = title;
                this.next = null;
            }

            public String getTitle() {
                return title;
            }

            public Song getNext() {
                return next;
            }

            public void setNext(Song next) {
                this.next = next;
            }
        }

        class Playlist {
            private Song happier;

            public Playlist() {
                this.happier = null;
            }

            public void addSong(String title) {
                Song newSong = new Song(title);
                if (happier == null) {
                    happier = newSong;
                } else {
                    Song current = happier;
                    while (current.getNext() != null) {
                        current = current.getNext();
                    }
                    current.setNext(newSong);
                }
            }

            public void displayPlaylist() {
                Song current = happier;
                if (current == null) {
                    System.out.println("Playlist kosong.");
                    return;
                }
                System.out.println("Daftar Lagu dalam Playlist:");
                while (current != null) {
                    System.out.println("- " + current.getTitle());
                    current = current.getNext();
                }
            }
        }
        public static void main(String[] args) {
            song outer = new song();
            Playlist myPlaylist = outer.new Playlist();
            myPlaylist.addSong("Playlist  pertama: " + "Talking to the moon");
            myPlaylist.addSong("Playslist kedua  : " + "Drunk Text");
            myPlaylist.addSong("Playlist  ketiga : " + "double take");
            myPlaylist.addSong("Playlist  keempat: " + "Seasons");

            myPlaylist.displayPlaylist();
        }
    }


