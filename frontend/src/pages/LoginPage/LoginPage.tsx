import { MainLayout } from '../../layouts/MainLayout/MainLayout';
import './LoginPage.css';

export function LoginPage() {
    return (
        <MainLayout>
            <div className='login-page'>
                <div className='login-card'>
                    <h2 className='login-title'>Acessar Conta</h2>
                    <form action="login" className='login-form'>
                        <label htmlFor="fname" className='login-text'>Nome:</label>
                        <input type="text" id="fname" name="fname" className='login-input'/>
                        <label htmlFor="lname" className='login-text'>Senha:</label>
                        <input type="password" id="lname" name="lname" className='login-input'/>
                        <input type="submit" value="Entrar" className='login-submit'/>
                        <label htmlFor="Terms" className='login-terms'>Continuando, você aceita os <a href="/terms">termos de serviço</a> e a <a href="/privacy">política de privacidade</a>.</label>
                    </form>
                </div>
            </div>
        </MainLayout>
    )
}