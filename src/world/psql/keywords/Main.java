package world.psql.keywords;

public class Main {

  public static void main(String[] args) {
    boolean isKeyword = KeywordsCheckerUtil.isSqlKeyword("Your word");
    System.out.println(isKeyword);
  }
}
