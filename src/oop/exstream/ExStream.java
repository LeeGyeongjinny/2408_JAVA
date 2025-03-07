package oop.exstream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ExStream {
    public static void main(String[] args) {
        BoardDTO board1 = new BoardDTO(1 ,"title1", "content1");
        BoardDTO board2 = new BoardDTO(2, "title2", "content2");
        BoardDTO board3 = new BoardDTO(3, "title3", "content3");

        List<BoardDTO> boards = new ArrayList<BoardDTO>();
        boards.add(board1);
        boards.add(board2);
        boards.add(board3);

//        for(int i = 0; i < boards.size(); i++) {
//            System.out.println(boards.get(i).getBoardTitle());
//        }

        // 스트림 생성
        Stream<BoardDTO> streamBoards = boards.stream();
//        streamBoards.forEach(board -> {
//            System.out.println(board.getBoardTitle());
//        });
        List <BoardDTO> filterList = streamBoards.filter(board -> board.getBoardId() % 2 == 0).toList(); // 2의 배수

        List<BoardDTO> exList = new ArrayList<>();
        for (BoardDTO board : filterList) {
            if(board.getBoardId() % 2 == 0) {
                exList.add(board);
            }
        }
    }
}

class BoardDTO {
    private long boardId;
    private String boardTitle;
    private String boardContent;

    public BoardDTO(long boardId, String boardTitle, String boardContent) {
        this.boardId = boardId;
        this.boardTitle = boardTitle;
        this.boardContent = boardContent;
    }

    public long getBoardId() {
        return boardId;
    }

    public void setBoardId(long boardId) {
        this.boardId = boardId;
    }

    public String getBoardTitle() {
        return boardTitle;
    }

    public void setBoardTitle(String boardTitle) {
        this.boardTitle = boardTitle;
    }

    public String getBoardContent() {
        return boardContent;
    }

    public void setBoardContent(String boardContent) {
        this.boardContent = boardContent;
    }
}