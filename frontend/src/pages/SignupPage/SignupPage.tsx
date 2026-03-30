import { MainLayout } from '../../layouts/MainLayout/MainLayout';
import './SignupPage.css';

export function SignupPage() {
    return (
        <MainLayout>
            <div className='signup-page'>
                <div className='signup-card'>
                    <h2 className='signup-title'>Criar Conta</h2>
                    <form action="signup" className='signup-form'>
                        <label htmlFor="fname" className='signup-text'>Nome:</label>
                        <input type="text" id="fname" name="fname" className='signup-input'/>
                        <label htmlFor="lname" className='signup-text'>Senha:</label>
                        <input type="password" id="lname" name="lname" className='signup-input'/>
                        <input type="submit" value="Cadastrar" className='signup-submit'/>
                        <label htmlFor="Terms" className='signup-terms'>Continuando, você aceita os <a href="/terms">termos de serviço</a> e a <a href="/privacy">política de privacidade</a>.</label>
                    </form>
                </div>
            </div>
        </MainLayout>
    )
}